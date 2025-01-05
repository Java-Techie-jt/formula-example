# formula-example
The @Formula annotation in Hibernate allows you to map a computed value or SQL expression to a field in your entity class. This field is not persisted in the database but is computed at runtime based on the SQL expression provided in the @Formula annotation.

### Add Products
```
curl -X 'POST' \
  'http://localhost:9191/products' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '[
	{
		"category" : "Electronics",
		"discountPercentage" : 5,
		"name" : "Apple iPhone 15",
		"price" : 999.99
	},
	{
		"category" : "Electronics",
		"discountPercentage" : 5,
		"name" : "Samsung Galaxy S23",
		"price" : 899.99
	},
	{
		"category" : "Electronics",
		"discountPercentage" : 5,
		"name" : "Sony WH-1000XM5 Headphones",
		"price" : 349.99
	},
	{
		"category" : "Computers",
		"discountPercentage" : 10,
		"name" : "Dell XPS 13 Laptop",
		"price" : 1199.99
	},
	{
		"category" : "Computers",
		"discountPercentage" : 10,
		"name" : "HP Spectre x360",
		"price" : 1349.99
	},
	{
		"category" : "Cameras",
		"discountPercentage" : 2,
		"name" : "Canon EOS Rebel T7",
		"price" : 549.99
	},
	{
		"category" : "Cameras",
		"discountPercentage" : 3,
		"name" : "Nikon D3500",
		"price" : 499.99
	},
	{
		"category" : "Cameras",
		"discountPercentage" : 0,
		"name" : "GoPro Hero 11",
		"price" : 399.99
	},
	{
		"category" : "Wearables",
		"discountPercentage" : 0,
		"name" : "Fitbit Charge 5",
		"price" : 149.99
	},
	{
		"category" : "Wearables",
		"discountPercentage" : 3,
		"name" : "Apple Watch Series 8",
		"price" : 399.0
	}
]
'```
