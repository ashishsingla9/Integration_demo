pipeline {
    agent any

    stages {
        stage('clean') {
            steps {
                echo 'cleaning..'
                mvn clean
            }
        }
        stage('build') {
            steps {
                echo 'building..'
                mvn install
            }
        }
        
        
    }
}
