pipelineJob('03-Deploy-Job') {
    description('Deploy job created by Job DSL')

    parameters {
        choiceParam(
            'ENVIRONMENT',
            ['development', 'test', 'production'],
            'Select the deployment environment'
        )
    }

    definition {
        cps {
            script('''
                pipeline {
                    agent any

                    stages {
                        stage('Deploy') {
                            steps {
                                echo "Deploying to ${params.ENVIRONMENT}"
                                sh 'echo "Deployment started"'
                            }
                        }
                    }
                }
            ''')

            sandbox()
        }
    }
}