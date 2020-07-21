pipeline {
    agent none
    environment{
        BASEURL = "/usr/local/src/gocd/jenkins/workspace/${JOB_NAME}"
    }
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
                    additionalBuildArgs "--build-arg jarpath=${BASEURL}/target"
                }
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