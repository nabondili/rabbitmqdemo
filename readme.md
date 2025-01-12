<h2>Instructions</h2>
1. install the docker from docker for desktop (https://docs.docker.com/desktop/setup/install/mac-install/)
2. download and run the rabbitmq image  
   1. docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:4.0-management
3. start spring boot application