-- 코드를 입력하세요
select t.flavor
from (SELECT f.flavor, f.total_order + sum(j.total_order) as total
from first_half f
join july j on f.flavor = j.flavor
group by f.flavor) t
order by total desc
limit 3;