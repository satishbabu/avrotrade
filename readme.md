This is a very simple project to try to understand the avro data format

avro/trade.avsc creates a trade with 2 string columns - trade_id and book_id

mvn compile will generate Trade.java in deafult package

Main.java has 2 methods.  One generates an avro file with 10 trades and another reads the avro file and prints the contents into console
