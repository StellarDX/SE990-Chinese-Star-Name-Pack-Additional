// Object * 19 Lyn A  ---  Spectroscopic Binary  ---  OID=@395874   (@@1536,8)  ---  coobox=3691 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=57103
Barycenter "19 Lyn A/HIP 35785/Gaia DR3 987326158587778432/TIC 51263554/PLX 1724/SBC9 445/ADS 6012 A/AG+55 595/BD+55 1192/CCDM J07228+5518A/CSI+55 1192 1/FK5 280/GC 9800/GCRV 4880/HD 57103/HGAM 567/HIC 35785/HR 2784/N30 1640/PMC 90-93 202/PPM 31091/ROT 1176/SAO 26312/SBC7 303/SKY# 13428/YZ 55 5042/[HFE83] 508/2MASS J07225205+5516530/ALS 16568/WDS J07229+5517A/TYC 3785-1697-1/PMSC 07147+5528A/PMSC 07147+5528Aab/uvby98 100057103/GEN# +1.00057103/WEB 7132/Gaia DR2 987326158587778432"
{
	ParentBody      "19 Lyn"
}

Star "19 Lyn Aa"
{
	DateUpdated     "2024-04-30"
	ParentBody      "19 Lyn A"
	Class           "B8V"
	AbsMagn         -0.68 // 计算的值
	MassSol         3.33
	Radius          2047100.46857455 // 计算的值
	LumBol          166.0
	Teff            12078

	BinaryOrbit     
	{
		PeriodDays      2.2596
		Eccentricity    0.08
		Inclination     90
		Epoch           2419031.632
		ArgOfPericenter 126.1
		MeanAnomaly     0
	}
}

Star "19 Lyn Ab"
{
	ParentBody      "19 Lyn A"
	Class           ""
	MassSol         2.39
}

// Object * 19 Lyn B  ---  Star  ---  OID=@395917   (@@1541,4)  ---  coobox=3691 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,X-ray Source 
Star "19 Lyn B/HIP 35783/Gaia DR3 987326227307654016/TIC 51263552/ADS 6012 B/BD+55 1192B/CCDM J07228+5518B/CSI+55 1192 2/GC 9799/GCRV 4879/GSC 03785-00913/HD 57102/HGAM 566/HIC 35783/HR 2783/IDS 07147+5528 B/PPM 400105/ROT 1175/SAO 26311/TYC 3785-913-1/2MASS J07225085+5517035/EXO 0718.7+5522/WDS J07229+5517B/** STF 1062/PMSC 07147+5528B/Gaia DR1 987326223011092992/uvby98 100057102/GEN# +1.00057102/WEB 7131/Gaia DR2 987326227307255424"
{
	DateUpdated     "2024-04-30"
	ParentBody      "19 Lyn"
	Parallax        4.9779
	AppMagn         6.72
	Class           "B9V"
	AbsMagn         0.21 // 计算的值
	MassSol         3.03
	Radius          2293368.15306403 // 计算的值
	LumBol          127.9
	Teff            10691

	Orbit     
	{
		SemiMajorAxis   2884.23933474148 // 14.75 asec
		ArgOfPericenter 315.56
		MeanAnomaly     0
	}
}

// Simbad显示这个系统中还有另外两颗距离较近的小星拥有十分接近的视差，此处将它们也包含在内，使得整个系统成为一个五星系统

// Object UCAC4 727-042414  ---  Star  ---  OID=@395875   (@@1536,9)  ---  coobox=3691 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "UCAC4 727-042414/Gaia DR3 987337939681876352/TIC 51263545/ADS 6012 C/CCDM J07228+5518C/CSI+55 1192 3/WDS J07229+5517C/** STF 1062C/2MASS J07224260+5517266/Gaia DR2 987337939681876352"
{
	DateUpdated     "2024-04-30"
	ParentBody      "19 Lyn"
	Parallax        4.9744
	AppMagn         12.76
	Class           ""
	AbsMagn         6.24 // 计算的值
	//MassKg           // log(g) = 4.553 cm/s^2 (疑问：这么大个恒星为何就这点星等？)
	//RadSol          46.5224 // Gaia DR3
	//LumBol          1208.9826902567 // 计算的值
	Teff            4990
	FeH             -0.046

	Orbit     
	{
		SemiMajorAxis   17573.9786380104
		ArgOfPericenter 293
		MeanAnomaly     0
	}
}

// Object HD 237611  ---  Star  ---  OID=@395876   (@@1536,10)  ---  coobox=3691 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source,X-ray Source 
Star "HD 237611/HIP 35787/Gaia DR3 988827610435458816/TIC 51263518/ADS 6012 D/AG+55 596/BD+55 1193/CCDM J07228+5518D/GC 9802/GSC 03785-00007/HIC 35787/PPM 31092/SAO 26313/TD1 30419/TYC 3785-7-1/YZ 55 5044/2MASS J07225387+5520270/EXO 0718.7+5526/WDS J07229+5517D/Gaia DR1 988827606138767360/Gaia DR2 988827610435458816"
{
	DateUpdated     "2024-04-30"
	ParentBody      "19 Lyn"
	Parallax        5.1523
	AppMagn         7.57
	Class           "A0V"
	AbsMagn         1.13 // 计算的值

	Orbit     
	{
		SemiMajorAxis   41684.2944467742
		ArgOfPericenter 4
		MeanAnomaly     0
	}
}

// Object * pi.02 UMa b  ---  Extra-solar Planet  ---  OID=@3801902   (@@-1,255)  ---  coobox=3320 
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate 
Planet "PI2 UMa b/4 UMa b/HD 73108b"
{
	ParentBody     "4 UMa"
	DiscMethod     "RadVel"
	DiscDate       "2007"
	MassJup        7.1

	Orbit
	{
		Epoch           2452987.394
		PeriodDays      269.3
		SemiMajorAxis   0.87
		Eccentricity    0.432
		ArgOfPericen    23.81
	}
}

// Object * tau UMa  ---  Spectroscopic Binary  ---  OID=@450334   (@@3194,0)  ---  coobox=3318 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "TAU UMa A" {ParentBody "TAU UMa"}
Remove "TAU UMa B" {ParentBody "TAU UMa"}
Star "TAU UMa A"
{
	DateUpdated     "2024-05-01"
	ParentBody      "HIP 45075"
	Class           "F6IIIn"
	AbsMagn         +1.73
	MassSol         1.8
	Radius          1719444.2499767 // 计算的值
	LumBol          16
	Teff            7343
	FeH             +0.57

	BinaryOrbit     
	{
		PeriodDays      1062.4
		Eccentricity    0.48
		Epoch           2425721.6
		ArgOfPericenter 169.4
		MeanAnomaly     0
	}
}

Star "TAU UMa B"
{
	ParentBody      "HIP 45075"
	Class           "F6.2?"
}
