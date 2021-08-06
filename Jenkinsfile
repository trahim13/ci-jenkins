pipeline {
//    agent any
   agent { docker { image 'maven:3.8.1'}}
   stages{
        stage ('Build'){
            steps{
                echo("Build")
                sh 'mvn --version'
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