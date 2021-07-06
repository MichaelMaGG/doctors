pipeline {

    agent any

    tools {
        maven 'Maven    '
    }

    environment {
        NEW_VERSION = '1.0';
    }

    stages {

        stage("build") {
            when {
                expression {
                    BRANCH_NAME = 'dev'
                }
            }
            steps {
                echo ''
            }
        }

        stage("") {
            steps {
                echo ''
            }
        }

        stage("") {
            steps {
                echo ''
            }
        }
    }

    post {
        //always {

        //}

        success {

        }
    }
}