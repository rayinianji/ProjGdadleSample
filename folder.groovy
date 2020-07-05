folder('ABC') {
    displayName('ABC')
    description('Folder for project ABC')
}

folder('ABC/Dev') {
    description('Folder containing all Dev jobs for ABC')
}

folder('ABC/QA') {
    description('Folder containing all QA jobs for ABC')
}

folder('ABC/Prod') {
    description('Folder containing all Prod jobs for ABC')
}

listView('ABC-Project') {
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