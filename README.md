# 491 Project -- Senior Design
# Home Node Design
# Leaf Node Design
# Database Design
The database so far has been designed with scalability in mind. I tried to define the most abstract versions of each item, so that in the future,
we can add new types of each thing. We are not done designing the database, so it will likely change. So far this is just a projected database design
that we think will be fairly versatile. Here is the current design of our database:
### Users
The users table will hold each user's information, such as password, username, email, first, last, and preferences.
### BaseNodes
The baseNodes table will hold a record for each baseNode that has been connected to the system. A base node can communicate with one user, but users can 
have multiple base nodes. Each baseNode will have a unique address, so that we can figure out which baseNode is communicating with the server.

### LeafNodes
The leafNodes table will hold a record for each leafNode that has connected to the network. Since leafNodes will not have access to the server, 
they will send their information to a baseNode, which will pass it up to the server. Therefore, each leafNode will store the baseNode's id number as well.
This way, a baseNode can have multiple leafNodes, but a leafNode can have only one baseNode. leafNodes will also have a unique address.

### Sensors
The sensors table will store a record of each sensor that exists on a leafNode. Sensors will also store the baseNode's id and a sensor type. 
This way, multiple sensors can be on one leafNode, but leafNodes cannot share a sensor. 

### SensorType
The sensorType table will be how we can tell what type of data is being stored. Each sensor will also store a unitID, which will show what type of measurements are being taken.

### Units
The units table will store the name of the unit being used. 

