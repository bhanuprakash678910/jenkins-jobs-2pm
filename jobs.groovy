node('SLAVE'){
  stage("example"){
   sh ''' uptime
          hostname '''
}}
