# Salesforce Fuse

This is an example of how to implement a handler for an Outbound Message from Salesforce to a cxf webservice running in JBoss Fuse.

# How to Install (Local)

1. Download and install JBoss Fuse
2. Download and install Maven
3. Download this repo
4. Run `mvn clean install`
5. In JBoss Fuse run
        features:install cxf
	   osgi:install -s mvn:com.example.salesforce/soap/${project.version}
6. Add a new _Outbound Message_ in Salesforce
7. Add a _Workflow_ that sends the _Outbound Message_ to your endpoint.  The URL would be in the format of
        http://example.com/cxf/Salesforce

# How to Use

1. Fire the _Workflow_
2. Inspect the logs by running `logs:display` in JBoss Fuse

# How to extend

You can add your own functionality by updating [NotificationBindingImpl.java](tree/master/src/main/java/com/sforce/soap/_2005/_09/outbound/NotificationBindingImpl.java) to add additional handling.  If you want the message to fail simply `return false` instead of `return true`

# What's Coming Next

* Openshift support
* Additional example of Fuse usage