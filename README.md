# animated-archer


	Cr�ation d'un projet Maven;
	Configuration de Maven: settings.xml
		<mirror>
		<server>
		<profil>
		<activeProfil>
	
	pom.xml; l'ajout de <destributionManagement>
	deployment sous Nexus
	
	add local Dependencies
	
	deployment WildFly local
	
	d�marrage wildFly sur @IP: modification de standalone.xml: Inetadress => 0.0.0.0
	
																offset liman estata3 ilayhi sebilan
																
																add 2 users (manager & application (role guest)
																
																d�marrage: standalone -b @IP (sur console)
																remarque: il faut arreter le serveur avec l'adaptateur IDE
																
	Deployment sur wildfly en ajoutant <hostname>, <username>, <password> & <port>
	
	-----------------------------consommation client --------------------
	
	projet Maven client 
	ajout de d�pendance via Nexus
	modification JNDI.properties (@IP hostserver + username (application) et password)
	
