-- 코드를 입력하세요
select i.ingredient_type as INGREDIENT_TYPE, sum(f.total_order) as TOTAL_ORDER
from first_half f join icecream_info i
where f.flavor = i.flavor
group by (i.ingredient_type);