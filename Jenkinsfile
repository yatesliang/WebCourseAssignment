pipeline {
    agent none
    stages {
        stage('Deploy') {
            steps {
                echo "deploying now"
                sh "./deploy.sh"
            }
        }
    }
}