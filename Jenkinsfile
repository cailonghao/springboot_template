pipeline {
    agent none
    stages{
        stage("test"){
            agent{
                docker{
                    image 'maven:3.6.0-alpine'
                    args '-v /root/.m2:/root/.m2'
                }
            }
            stages{
                stage('build'){
                     steps {
                            sh 'mvn -B -DskipTests clean package'
                        }
                }
                 stage('test'){
                        steps{
                            sh 'mvn test'
                        }
                    }
                }
            }
        stage("install"){
            agent {
                dockerfile {
                    filename 'Dockerfile'
                }
            }
            stages{
                stage("pwd"){
                    steps{
                        sh 'echo $pwd'
                    }
                }
                stage("show"){
                    steps{
                        sh 'curl http://localhost:10000/start '
                    }
                }
            }
        }

    }
}