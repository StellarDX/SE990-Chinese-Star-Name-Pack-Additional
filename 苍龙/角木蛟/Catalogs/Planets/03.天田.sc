// Object * 64 Vir  ---  Double or Multiple Star  ---  OID=@2133684   (@@44386,14)  ---  coobox=14068 
// Object types: Chemically Peculiar Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,UV-emission Source,X-ray Source 
Star "64 Vir A"
{
	DateUpdated     "2024-05-20"
	ParentBody      "64 Vir"
	Class           "kA3hA6mA7"
	AbsMagn         1.78 // 计算的值
	MassKg          3.0858210366134e+30 // log(g) = 4.04 cm/s^2
	RadSol          1.97 // Gaia DR3
	LumBol          18.0208369073587 // 计算的值
	Teff            8473
	FeH             -0.686

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   49.11143
		Eccentricity    0.194769299
		Inclination     0.743645191
		AscendingNode   0
		ArgOfPericenter 132.898766
		MeanAnomaly     -163.442923
	}
}

Star "64 Vir B"
{
	ParentBody      "64 Vir"
	Class           "F5.7?"
}

// Object * 84 Vir  ---  High Proper Motion Star  ---  OID=@5475604   (@@-1,255)  ---  coobox=14246 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Variable Star,Star,Infra-Red Source 
Star "84 Vir A"
{
	DateUpdated     "2024-05-20"
	ParentBody      "84 Vir"
	Class           "K2IIIb:CN0.5"
	AbsMagn         1.02 // 计算的值

	BinaryOrbit     
	{
		Separation      214.802393993153 // 2.83 asec
	}
}

// Object * 84 Vir B  ---  High Proper Motion Star  ---  OID=@2198258   (@@45871,15)  ---  coobox=14246 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "84 Vir B/Gaia DR3 3713442334873031040/ADS 9000 B/BD+04 2775B/CSI+04 2775 3/GCRV 8108/HD 119425B/IDS 13380+0403 B/WDS J13431+0332B/** STF 1777B/TYC 311-1612-2/WEB 11800/Gaia DR2 3713442334873031040"
{
	DateUpdated     "2024-05-20"
	ParentBody      "84 Vir"
	Parallax        13.0174
	AppMagn         8.23
	Class           "G3IV"
	AbsMagn         3.8 // 计算的值
}
