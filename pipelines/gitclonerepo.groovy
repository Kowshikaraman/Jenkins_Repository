def run(String repoUrl, String branch, String folder) {
    echo "📥 Cloning ${repoUrl} (branch: ${branch}) into ${folder}"
    // deleteDir()
        bat '''
        if exist ExpressJSApp (
        rmdir /S /Q ExpressJSApp
        )
        ''' 
        bat "git clone -b ${branch} ${repoUrl} ${folder}"
}

return this
