def build(){
    def cmdExe = bat """cd ExpressJSApp"""
    dir("ExpressJSApp"){
        // bat """docker build -t expressapp:1.0.1 . """
        def exitCode = bat(script: 'docker build -t expressapp:1.0.1 . ', returnStatus: true)
        return exitCode
    }
}
return this