select b.category, sum(sales) as total_sales
from book_sales s
join book b on b.book_id = s.book_id
where s.sales_date >= '2022-01-01' and s.sales_date <= '2022-01-31'
group by b.category
order by b.category asc;