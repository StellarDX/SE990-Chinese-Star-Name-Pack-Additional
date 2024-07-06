// Object * 60 Aur  ---  Double or Multiple Star  ---  OID=@918491   (@@22446,11)  ---  coobox=5217 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
Star "60 Aur A"
{
	DateUpdated     "2024-07-06"
	ParentBody      "60 Aur"
	Class           "A8"
	AbsMagn         2.11
	Teff            6223
	FeH             0.04
	Age             1.7

	BinaryOrbit     
	{
		Period          271.10
		Separation      47.8323606039308 // 0.793 asec
		Eccentricity    0.487
		Inclination     58.4
		AscendingNode   156.4
		Epoch           2452537.992178784217685
		ArgOfPericenter 239.7
		MeanAnomaly     0
	}
}

Star "60 Aur B"
{
	DateUpdated     "2024-07-06"
	ParentBody      "60 Aur"
	Class           "G0"
}

// Object * 20 Lyn A  ---  Star  ---  OID=@414193   (@@838,10)  ---  coobox=3791 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "20 Lyn A/HIP 35731/Gaia DR3 977131894795719680/TIC 470971435/PLX 1721/ADS 6004 A/AG+50 668/AGKR 6601/CCDM J07222+5009A/CSI+50 1420 1/GC 9789/GCRV 4873/GSC 03401-01645/HD 57067/HIC 35731/PPM 31083/SAO 26306/TYC 3401-1645-1/YZ 50 2823/uvby98 100057067/2MASS J07221510+5008557/WDS J07223+5009A/** STF 1065A/BD+50 1420A/Gaia DR1 977131894795719680/GEN# +1.00057067/WEB 7121/Gaia DR2 977131894795719680"
{
	DateUpdated     "2024-07-06"
	ParentBody      "20 Lyn"
	Parallax        6.487
	AppMagn         7.49
	Class           "A8V"
	AbsMagn         1.55 // 计算的值 (Gaia把数据标反了?)
	MassKg          2.9104560664762e+30 // log(g) = 3.799 cm/s^2
	RadSol          2.525 // Gaia DR3
	LumBol          15.1892151292056 // 计算的值
	Teff            7171
	FeH             -0.622

	BinaryOrbit     
	{
		Separation      2296.90148741798 // 14.90 asec
	}
}

// Object * 20 Lyn B  ---  Star  ---  OID=@414194   (@@838,11)  ---  coobox=3791 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "20 Lyn B/HIP 35726/Gaia DR3 977131899092457344/TIC 470971433/ADS 6004 B/AG+50 667/BD+50 1420B/CCDM J07222+5009B/CSI+50 1420 2/GC 9787/GCRV 4874/GSC 03401-01646/HD 57066/HIC 35726/PPM 31081/SAO 26305/SKY# 13401/TYC 3401-1646-1/YZ 50 2822/2MASS J07221360+5008518/WDS J07223+5009B/** STF 1065B/Gaia DR1 977131894796690560/uvby98 100057066/GEN# +1.00057066/WEB 7117/Gaia DR2 977131899091978240"
{
	DateUpdated     "2024-07-06"
	ParentBody      "20 Lyn"
	Parallax        6.567
	AppMagn         7.64
	Class           "A6V"
	AbsMagn         1.73 // 计算的值
	MassKg          3.66197216880505e+30 // log(g) = 4.001 cm/s^2
	RadSol          2.244597 // Gaia DR3
	LumBol          20.4722825161258 // 计算的值
	Teff            8195
	FeH             -0.503
}
