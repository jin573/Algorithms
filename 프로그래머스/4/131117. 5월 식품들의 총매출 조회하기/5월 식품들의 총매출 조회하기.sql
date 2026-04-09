-- 코드를 입력하세요
SELECT f.product_id, f.product_name, sum(o.amount) * f.price as total_sales
from food_product f
join food_order o on f.product_id = o.product_id
where o.produce_date between '2022-05-01' and '2022-05-31'
group by o.product_id
order by total_sales desc, f.product_id asc;