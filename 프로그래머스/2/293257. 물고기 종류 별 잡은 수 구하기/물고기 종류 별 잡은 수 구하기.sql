select count(*) as fish_count, i.fish_name as fish_name
from fish_info f
join fish_name_info i on f.fish_type = i.fish_type
group by f.fish_type, i.fish_name
order by fish_count desc;