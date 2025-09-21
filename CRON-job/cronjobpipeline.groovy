// CRON Scripted Pipeline
node {
    properties([
        pipelineTriggers([
            cron('H/2 * * * *') // every 2 minutes
        ])
    ])

    stage('Trigger Main Pipeline') {
        echo "Triggered at: ${new Date()}"
    }
}
