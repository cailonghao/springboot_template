pipeline {
    agent none
    stages {
        stage("test") {
            agent {
                docker {
                    image 'maven:3.6.0-alpine'
                    args '-v /root/.m2:/root/.m2'
                }
            }
            stages {
                stage('build') {
                    steps {
                        sh 'mvn -B -DskipTests clean package'
                    }
                }
                stage('test') {
                    steps {
                        sh 'mvn test'
                    }
                }
            }
        }
        stage("install") {
            agent {
                dockerfile {
                    additionalBuildArgs " -t myapp:${env.BUILD_NUMBER} --build-arg version=1.0.2"
                }
            }
            steps {
                echo "$PWD"
            }
        }
        stage("deploy") {
            steps {
                sh "docker run -d --name mytest -p 10000:10000 myapp:${env.BUILD_NUMBER}"
            }
        }
    }
}