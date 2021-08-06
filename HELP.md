ERROR:Invalid agent type "docker" specified. Must be one of [any, label, none]
SOLUTION: Install docker plugins;
https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/Fix-Jenkins-Invalid-agent-type-Docker-specified-any-label-none-error


docker ps
docker exec -it <container_id> bash


ERROR: docker inspect -f . maven:3.8.1-adoptopenjdk-11 docker: Permission denied
SOLUTION: make sure what all variables are right in your configuration file.
- /usr/bin/docker:/usr/bin/docker 