node(){
  stage("example"){
   sh ''' uptime
          hostname '''
}}
