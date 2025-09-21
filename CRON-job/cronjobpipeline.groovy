node {
    properties([
        pipelineTriggers([
            // cron('H/2 * * * *') 
        ])
    ])

    stage('Trigger Main Pipeline') {
        echo "Triggered at: ${new Date()}"
    }
}
