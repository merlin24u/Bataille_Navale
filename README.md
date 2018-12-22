# Bataille_Navale

- Paul Merlin
- Quentin Thouvenot

Guide d'utilisation :
- Se mettre à la racine du répertoire /bin du projet pour lancer le registre RMI, le serveur et le/les clients (Dans cet ordre)
- RMI : (start) rmiregistry -J-Djava.rmi.server.codebase=http://localhost:8080/shared/Game
- Serveur : java server.start.Main -mode:1/2 -epoque:XXe/XVIe (Ex : java server.start.Main 1 XXe)
- Client : java client.start.Main

Compilation (Ant) :
- Compilation uniquement : ant
- Lancer serveur : ant server -Dmode=1/2 -Depoque=XXe/XVIe
- Lancer client : ant client
- Clean : ant clean