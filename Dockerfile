FROM ubuntu:latest

RUN apt-get -y update --fix-missing
RUN apt-get -y install python3-pip python3-dev build-essential
RUN pip3 install --upgrade pip

WORKDIR /logmetrix/

COPY ./requirements.txt /requirements.txt


RUN pip3 install -r requirements.txt