folder('ABC/Dev') {
    description('Folder containing all DEV jobs for project ABC')
}
folder('ABC/QA') {
    description('Folder containing all QA jobs for project ABC')
}
folder('ABC/Prod') {
    description('Folder containing all PROD jobs for project ABC')
}

listView('ABC') {

  description('All unstable jobs for project ABC')
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
	
job('ABC/Dev/CI-CD') {
    scm {
        git {
		
            remote {
                url('https://github.com/rayinianji/NewWebproject.git')
				
                }
			branch('master')	
        }
    }
}
	
job('ABC/QA/CI-CD') {
    scm {
        git {
		
            remote {
                url('https://github.com/rayinianji/NewWebproject.git')
				
                }
			branch('master')	
        }
    }
}

job('ABC/Prod/CI-CD') {
    scm {
        git {
		
            remote {
                url('https://github.com/rayinianji/NewWebproject.git')
				
                }
			branch('master')	
        }
    }
}
}