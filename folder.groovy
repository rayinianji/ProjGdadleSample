folder('project-a/testing') {
    description('Folder containing all QA jobs for project A')
}
job('Webapp_Graddle') {
    scm {
        git {
		
            remote {
                url('https://github.com/rayinianji/NewWebproject.git')
				
                }
			branch('master')	
        }
    }
}