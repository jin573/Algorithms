-- 코드를 작성해주세요
select i.id as ID, n.fish_name as FISH_NAME, i.length as LENGTH
from fish_info i
join fish_name_info n
on i.fish_type = n.fish_type
where i.length = (select max(i2.length) from fish_info i2
                 where i2.fish_type = n.fish_type)
order by i.id asc;                 
                 
                 