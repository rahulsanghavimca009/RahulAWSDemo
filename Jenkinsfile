pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/rahulsanghavimca009/rahul-aws-jen-doc.git'
            }
        }
        stage('Build JAR') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t RahulAWSDemo:latest .'
            }
        }
        stage('Run Container') {
            steps {
                sh '''
                docker rm -f RahulAWSDemo || true
                docker run -d --name rahul -p 9090:9090 RahulAWSDemo:latest
                '''
            }
        }
    }
}