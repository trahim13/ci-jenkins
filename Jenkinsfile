pipeline {
   agent any
   environment {
       mavenHome = tool 'myMaven'
       PATH = "$mavenHome/bin:$PATH"
   }
   stages{
        stage ('Checkout'){
            steps{
                echo("Build")
                echo "PATH - $PATH"
                echo "BUILD NUMBER - $env.BUILD_NUMBER"
                echo "BUILD ID - $env.BUILD_ID"
                echo "JOB NAME - $env.JOB_NAME"
                echo "BUILD URL - $env.BUILD_URL"
                echo "env - $env"
                sh "docker version"
                sh "mvn --version"
                sh "java -version"
            }
        }

        stage ('Clean'){
            steps{
                sh "mvn clean"
            }
        }

        stage ('Build'){
            steps{
                sh  "mvn package"
            }
        }


        stage ('Test'){
            steps{
                echo("Test")
            }
        }
        stage ('Test Integration'){
            steps{
                echo("Test Integration")
            }
        }

   }
   post {
        always {
         echo("I ran always")
        }
        success {
         echo("I ran in success")
        }
        failure {
         echo("I ran in failure")
        }
      }
}