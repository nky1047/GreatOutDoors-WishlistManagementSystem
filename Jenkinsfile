pipeline {

	agent any
	tools {
		maven 'maven'
	}
	environment {
		env.PATH = env.PATH + ";c:\\Windows\\System32" 
	}

	stages {

			
		stage ('Sonarqube deployment Stage'){
			steps{
				bat 'mvn sonar:sonar'	
			}	
		}
		
		
		
		
		
		
	}	
}


