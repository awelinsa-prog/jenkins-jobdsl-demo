pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Create Jenkins Jobs') {
            steps {
                jobDsl(
                    targets: 'jobs/*.groovy',
                    removedJobAction: 'IGNORE',
                    removedViewAction: 'IGNORE',
                    lookupStrategy: 'JENKINS_ROOT'
                )
            }
        }
    }

    post {
        success {
            echo 'All Job DSL files were processed successfully'
        }

        failure {
            echo 'Failed to process the Job DSL files'
        }
    }
}