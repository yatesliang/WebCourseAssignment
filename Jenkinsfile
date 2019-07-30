pipeline {
    agent none
    stages {
        stage('Deploy') {
            agent any
            steps {
                sh "sudo chmod +x deploy.sh"
                echo "deploying now"
                sh "./deploy.sh"
            }
        }
    }
}