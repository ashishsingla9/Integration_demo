pipeline {
    agent any

    stages {
        stage('clean') {
            steps {
                echo 'cleaning..'
                sh 'mvn clean'
                
            }
        }
        stage('build') {
            steps {
                echo 'building..'
                sh 'mvn package'
            }
        }
        
        
    }
}
