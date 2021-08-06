pipeline {
   agent any

   stages{
        stage ('Build'){
            steps{
                echo("Build")
                echo "PATH - $PATH"
                echo "BUILD NUMBER - $env.BUILD_NUMBER"
                echo "BUILD ID - $env.BUILD_ID"
                echo "JOB NAME - $env.JOB_NAME"
                echo "BUILD URL - $env.BUILD_URL"
                echo "env - $env"
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