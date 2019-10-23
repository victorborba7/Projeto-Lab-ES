#!/bin/sh

mvn clean install

rm -rf ../judocas/target/EAP-7.2.0/standalone/deployments/judocas.war*

cp target/judocas.war ../judocas/target/EAP-7.2.0/standalone/deployments/
