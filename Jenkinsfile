pipeline {

	agent any
	tools {
		maven 'maven'
	}
	stages {
	
		stage ('Sonarqube deployment Stage'){
			steps{
				bat 'mvn sonar:sonar'	
			}	
		}
		
		
		
		
	}	
}


