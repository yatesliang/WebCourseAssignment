pipeline {
    agent none
    stages {
        stages('Deploy') {
            steps {
                echo "deploying now"
                sh "./deploy.sh"
            }
        }
    }
}