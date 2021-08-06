pipeline {
   agent any
   stages{
        stage ('Build'){
            steps{
                echo("Build")
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