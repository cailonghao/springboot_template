pipeline {
    agent any
    stages{
        stage("test"){
            agent{
                docker{
                    image 'maven:3.6.0-alpine'
                    args '-v /root/.m2:/root/.m2'
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
        }
        stage("install"){
            agent {
                dockerfile true
            }
            stages{
                stage("show"){
                    steps{
                        sh 'curl http://localhost:10000/start '
                    }
                }
            }
        }

    }
}