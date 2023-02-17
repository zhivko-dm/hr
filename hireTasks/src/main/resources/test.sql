
	cu_master:	{ id, customer_no, company_name}

	sa_order:	{ id, cu_master_id, order_no, order_dt, order_price, }
	
	sy_address:	{ id, ref_no, ref_type, country, city, address_line1, address_line2 address_line2}
	
	vn_master: 	{ id, name, acct_no}
	
	vn_contact:	{ id, vn_master_id, contact_type, f_name, l_name }

/* 
 * Task 1 
 * What do you think about the following SQL Statement? 
 */
SELECT cm.company_name
	,cm.customer_no
	,sa.order_no
	,sa_order_dt
	,sa.order_price
FROM cu_master cm
	INNER JOIN sa_order so ON so.customer_no = cm.customer_no
;	

/* 
 * Task 2
 * What do you think about the following SQL Statement?  How can it be rewritten?
**/
SELECT cm.*
, a.* 
FROM cu_master cm 
INNER JOIN (SELECT * FROM sy_address) AS a ON a.ref_no = cm.customer_no
;

/*
 * Task 3
 * Write a query that returns all the customers that don't have orders placed during the month of June
 */

/*
 * Task 4
 * Write a query that returns all the sales order for Customer # 12345 during the month of June
 */

 /*
  * Task 4 
  	Using the ER Diagram shown, write a query to 
  		 select all vendors (Account # and Name), and any related contact records.
  		 Sort the records by vendor and contact type. 
  */
