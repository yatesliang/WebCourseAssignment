pipeline {
    agent none
    stages {
        stage('Deploy') {
            agent any
            steps {
                echo "deploying now"
                sh "./deploy.sh"
            }
        }
    }
}