pipelineJob('01-Build-Job') {
    description('Build job created by Job DSL')

    definition {
        cps {
            script('''
                pipeline {
                    agent any

                    stages {
                        stage('Build') {
                            steps {
                                echo 'Starting the build'
                                sh 'echo "Building the application"'
                            }
                        }
                    }
                }
            ''')

            sandbox()
        }
    }
}