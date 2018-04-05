pipeline {
    agent any
	parameters {
        string(name: 'DeployTO', defaultValue: 'DEV', description: 'Select Deployment location')
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}