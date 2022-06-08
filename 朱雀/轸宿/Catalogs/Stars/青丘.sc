Remove "26 Crt"
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=57047%20
// Gaia DR2说CD(HD 101665 AB)的退行速度只有29.8 Km/s不同于A(35.25 Km/s)
// P.Eggleton认为这只是一对光学多星，不是真正的多星系统
// 另外，A本身可能也有一颗伴星Ab, 光谱型为F7V, 质量是1.21太阳质量，但不确定这颗星的存在性(存疑)。
// C和D的质量分别是1.53和0.7个太阳质量，C的光谱型是F5V，两星相距4.72秒，CD系统距离主星66.18秒
Star "青丘增一/26 Crt/HJ 4465/HIP 57047/SAO 202717/HD 101666/HR 4503/WDS J11417-3230"
{
	/*Observation data*/
	RA      11 41 44.14
	Dec     -32 30 10.9
	AppMagn 5.2
	/*Characteristics*/
	Class   "K5III"
	/*Astrometry*/
	Dist    133
	AbsMagn -0.42
	/*Details*/
	MassSol 3.51 // 主星质量
}

Remove "23 Crt"
Star "青丘增二/23 Crt/HIP 56657/SAO 202634/HD 100953/HR 4473"
{
	/*Observation data*/
	RA      11 37 1.36
	Dec     -32 59 31.7
	AppMagn 6.3
	/*Characteristics*/
	Class   "F5V"
	/*Astrometry*/
	Dist    68
	AbsMagn 2.13
}

Remove "HD 100910" // 中西对照相恒星图表1950的数据，也有人说是22 Crt
Star "青丘增三/HIP 56623/SAO 202625/HD 100910"
{
	/*Observation data*/
	RA      11 36 37.24
	Dec     -34 38 57.7
	AppMagn 7.55
	/*Characteristics*/
	Class   "F5V"
	/*Astrometry*/
	Dist    68
	AbsMagn 3.39
}
