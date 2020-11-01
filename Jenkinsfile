pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                echo 'Compiling..'
                   sh "mvn compile"
            }
        }
        stage('Install') {
            steps {
                echo 'Installing..'
                   sh "mvn install"
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                   sh "mvn deploy"
            }
        }
    }
}