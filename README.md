jBilling docker image
==============

#### BUILD
    git clone https://github.com/tropicloud/jbilling.git
    cd jbilling
    docker build --rm -t tropicloud/jbilling .

#### RUN
    docker pull tropicloud/jbilling
    docker run -d --name jbilling -p 8022:22 -p 8080:8080 tropicloud/jbilling
    

Navigate to `http://localhost:8080/jbilling/signup` to sign up your username.