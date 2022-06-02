const check_miss = (n) => {
    let temp = Array(Math.max(...n)).fill(0);
  
    n.forEach((item) => (temp[item] = 1));
  
    const missing_items = temp
      .map((item, index) => (item === 0 ? index : -1))
      .filter((item) => item !== -1);
  
    console.log(missing_items);
  };
  
  n = [5, 4, 2, 1, 10, 0];
  check_miss(n);