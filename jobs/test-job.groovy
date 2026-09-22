pipelineJob('02-Test-Job') {
    description('Test job created by Job DSL')

    definition {
        cps {
            script('''
                pipeline {
                    agent any

                    stages {
                        stage('Test') {
                            steps {
                                echo 'Starting the tests'
                                sh 'echo "Running application tests"'
                            }
                        }
                    }
                }
            ''')

            sandbox()
        }
    }
}